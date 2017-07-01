package Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, List<String>> nameToNum = new HashMap<String, List<String>>();
    private final Map<String, String> nameToAddress = new HashMap<String, String>();

    public void addNumber(String name, String number) {
        if (!this.nameToNum.containsKey(name)) {
            this.nameToNum.put(name, new ArrayList<String>());
            this.nameToNum.get(name).add(number);
        } else {
            this.nameToNum.get(name).add(number);
        }

    }

    public void removeEntry(String name) {
        nameToNum.remove(name);
        nameToAddress.remove(name);

    }

    public List<String> hasSubstring(String subString) {
        List<String> names = new ArrayList<String>();
        boolean truth = false;
        for (String temp1 : nameToNum.keySet()) {
            if (temp1.contains(subString)) {
                if (!names.contains(temp1)) {
                    names.add(temp1);
                    truth = true;
                }
            }

        }
        for (List<String> temp : nameToNum.values()) {
            for (String temp2 : temp) {
                if (temp2.contains(subString)) {
                    if (!names.contains(temp2)) {
                        names.add(hasNumberReturnName(temp2));
                        truth = true;
                    }
                }

            }

        }

        for (String temp3 : nameToAddress.keySet()) {
            if (temp3.contains(subString)) {
                if (!names.contains(temp3)) {
                    names.add(temp3);
                    truth = true;
                }
            }
        }
        for (String temp4 : nameToAddress.values()) {
            if (temp4.contains(subString)) {
                if (!names.contains(temp4)) {
                    names.add(hasAddressReturnName(temp4));
                    truth = true;
                }
            }

        }
        if (truth) {
            return names;
        }
        return null;
    }

    public void addAddress(String name, String address) {
        this.nameToAddress.put(name, address);
    }

    public List<String> hasNameReturnNumber(String name) {
        for (String temp : nameToNum.keySet()) {
            if (temp.equals(name)) {
                return nameToNum.get(temp);
            }
        }
        return null;
    }

    public String hasNameReturnAddress(String name) {
        for (String temp : nameToAddress.keySet()) {
            if (temp.equals(name)) {
                return nameToAddress.get(temp);
            }
        }
        return null;
    }

    public String hasAddressReturnName(String address) {
        for (String temp : nameToAddress.values()) {
            if (temp.equals(address)) {
                for (String temp2 : nameToAddress.keySet()) {
                    if (nameToAddress.get(temp2).equals(temp)) {
                        return temp2;
                    }
                }
            }
        }
        return null;
    }

    public String hasNumberReturnName(String number) {
        for (List<String> tempSet : nameToNum.values()) {
            for (String temp : tempSet) {
                if (temp.equals(number)) {
                    for (String temp2 : nameToNum.keySet()) {
                        if (nameToNum.get(temp2).equals(tempSet)) {
                            return temp2;
                        }
                    }
                }
            }
        }
        return null;
    }

}
