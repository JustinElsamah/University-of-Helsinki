package Functionality;

import Phonebook.PhoneBook;
import java.util.Collections;
import java.util.List;

public class CommandLogic {

    private final PhoneBook phonebook = new PhoneBook();

    public void command1(String name, String number) {
        phonebook.addNumber(name, number);
    }

    public void command2(String name) {
        List<String> numbers = phonebook.hasNameReturnNumber(name);
        if (numbers != null) {
                printNumbers(name);
        } else {
            System.out.println("  not found");
        }
    }

    public void command3(String number) {
        if (phonebook.hasNumberReturnName(number) != null) {
            System.out.println(" " + phonebook.hasNumberReturnName(number));
        } else {
            System.out.println(" not found");
        }
    }

    public void command4(String name, String address) {
        phonebook.addAddress(name, address);
    }

    public void command5(String name) {
        if(phonebook.hasNameReturnAddress(name) == null && phonebook.hasNameReturnNumber(name) == null){
            System.out.println("  not found");
            return;
        }
        if (phonebook.hasNameReturnAddress(name) != null) {
            System.out.println("  address: " + phonebook.hasNameReturnAddress(name));
        } else {
            System.out.println("  address unknown");
        }
        if (phonebook.hasNameReturnNumber(name) != null) {
            System.out.println("  phone numbers: ");
            for (String number : phonebook.hasNameReturnNumber(name)) {
                System.out.println("   " + number);
            }
        } else {
            System.out.println("  phone number not found");
        }
    }

    public void command6(String name) {
        phonebook.removeEntry(name);
    }

    public void command7(String subString) {
        
        if (phonebook.hasSubstring(subString) != null) {
            List<String> names = phonebook.hasSubstring(subString);
            Collections.sort(names);
            for (String name : names) {
                System.out.println("\n " + name);
                this.command5(name);
            }
        } else {
            System.out.println(" keyword not found");
        }
    }

    public void printNumbers(String name){
        for (String number : phonebook.hasNameReturnNumber(name)) {
                    System.out.println(" " + number);
        }
    }
}
