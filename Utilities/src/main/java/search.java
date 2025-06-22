public class search {

    public static boolean hasElement(String [] original, String[] modified){
        for(int i = 0; i < original.length; i++){ //search original list
            for(int j = 0; j < modified.length; j++){//search modified list
                if(original[i].equals(modified[j])){//compare both lists
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String [] args){
        String[] first = {"apple", "banana", "orange"};
        String[] second = {"grape", "banana", "cherry"};
        //boolean result = hasElement(first, second);
        //System.out.println(result);
        String[] result = getDuplicates(first,second);
        for(int i = 0; i < result.length; i ++){
            System.out.println(result[i]);
        }


    }

    public static String[] getDuplicates(String[] original, String[] selected){
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

//Do a functio for contains.search for a value on a list
}
