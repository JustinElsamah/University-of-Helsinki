package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {
        Map<Film, Rating> personRatings = register.getPersonalRatings(person);
        Boolean seenEveryMovie = true;
        if (personRatings.isEmpty()) {
            Film film;
            int temp = 0;
            int max = 0;

            Map<Film, List<Rating>> filmRepositories = register.filmRatings();
            
            for (Film tempFilm : filmRepositories.keySet()) {
                for (Rating rating : filmRepositories.get(tempFilm)) {
                    temp += rating.getValue();
                }
                if (temp > max) {
                    max = temp;
                }
                temp = 0;
            }

            for (Film tempFilm : filmRepositories.keySet()) {
                for (Rating rating : filmRepositories.get(tempFilm)) {
                    temp += rating.getValue();
                }
                if (temp == max) {
                    return tempFilm;
                }
                temp = 0;
            }
            return null;

        }
        
        for (Film film :register.filmRatings().keySet()) {
            int temp = 0;
            int max = Integer.MIN_VALUE;
            if (!personRatings.keySet().contains(film)) {
               //We know we are now in the money
               
               
               List<Person> list = register.reviewers();
               list.remove(person);
               for(Person otherPerson:list){
                   for(Film otherFilm:register.getPersonalRatings(otherPerson).keySet()){
                       if(personRatings.containsKey(otherFilm)){
                           temp += register.getRating(person, otherFilm).getValue() * register.getRating(otherPerson, otherFilm).getValue();
                       }
                   }
                   if(temp > max){
                       max = temp;
                   }
                   temp = 0;
               }
               Person bestMatch = null;
               for(Person otherPerson:list){
                   for(Film otherFilm:register.getPersonalRatings(otherPerson).keySet()){
                       if(personRatings.containsKey(otherFilm)){
                           temp += register.getRating(person, otherFilm).getValue() * register.getRating(otherPerson, otherFilm).getValue();
                       }
                   }
                   if(temp == max){
                       bestMatch = otherPerson;
                   }
                   temp = 0;
               }
               
               //We know the best match now what
               List<Film> listOfFilms = new ArrayList<Film>();
               for(Film tempFilm:register.getPersonalRatings(bestMatch).keySet()){
                   listOfFilms.add(tempFilm);
               }
               
               Collections.sort(listOfFilms, new FilmComparator(register.filmRatings()));
              Film bestFilmMatch = null;
              for(Film tempFilm:listOfFilms){
                  if(!register.getPersonalRatings(person).keySet().contains(tempFilm)){
                      bestFilmMatch = tempFilm;
                      break;
                  }
              }
              if(bestFilmMatch == null){
                  return null;
              }
              if(register.getRating(bestMatch, bestFilmMatch).getValue() > 1){
                  return bestFilmMatch;
              }
               
               break;
            }
        }
        
        return null;
    }
}
