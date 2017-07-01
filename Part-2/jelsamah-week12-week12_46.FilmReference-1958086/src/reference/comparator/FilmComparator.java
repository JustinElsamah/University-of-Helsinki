package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film>{

    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        return valueOf(ratings.get(o2)) - valueOf(ratings.get(o1));
    }
    
    public static int valueOf(List<Rating> list){
        int temp = 0;
        for(Rating rating:list){
            temp += rating.getValue();
        }
        return temp;
    }
    

}
