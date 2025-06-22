public class search {


    public static void main(String [] args){
        String[] first = {"apple", "banana", "orange", "banana", "rose"};
        String[] second = {"grape", "banana", "cherry", "banana", "avocado"};
        String[] list = {"grape", "banana", "cherry", "banana", "avocado"};
        /*boolean result = hasElement(first, second);
        System.out.println(result);
        String[] result = getDuplicates(first,second);
        for(int i = 0; i < result.length; i ++){
            System.out.println(result[i]);
        }*/
        Object result = getValue(list, "orange");
        System.out.println(result);


    }

//Checks if a list there is a common value on both lists
    public static boolean hasElement(String [] original, String[] modified){// uses two lists of strings as parameters
        for(int i = 0; i < original.length; i++){ //search original list
            for(int j = 0; j < modified.length; j++){//search modified list
                if(original[i].equals(modified[j])){//compare both lists
                    return true;
                }
            }
        }

        return false;
    }



//Compares two arrays, looks for the duplicates on both arrays and returns those duplicates
    public static String[] getDuplicates(String[] original, String[] selected){// uses two lists of strings as parameters
        String[] duplicates = new String[original.length];//size of the original array
        int count = 0;//quantity of elements stored in the common array
        for(int i = 0; i < original.length; i++){//iterate first list
            for(int j = 0; j < selected.length; j++){//iterate second list
                if(original[i].equals(selected[j])){//compares if the value is in the original and the selected
                    boolean found = false;
                    for(int k = 0; k < count; k++){
                        if(duplicates[k].equals(original[i])){//if there is no match this line wont execute
                           found = true;
                            break;
                        }
                    }
                    if(!found){//bc found might change to true
                        duplicates[count] = original[i];//adds the value from the original to the next available index on the duplicates list
                        count++;
                    }
                }

            }
        }
        return(duplicates);
    }


//Searches for a value and returns that value
    public static Object getValue(String[] list, String value){//uses a list and value as parameters
        for(int i = 0; i < list.length; i++){//iterate the list
            if(list[i].equals(value)){//compare if the value matches the index
                return value;//if found return true
            }
        }
        return null;//else return false
    }

    
}
