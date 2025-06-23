public class addValue {
    private String[] data = new String[0];
    private int count = 0;

    public void addValue(String value){
        String[] newData = new String[count + 1];
        for(int i = 0; i < newData.length; i++){
            newData[i] = data[i];
        }
        newData[count] = value;
        data = newData;
        count++;
    }

    public void printList() {
        for (int i = 0; i < count; i++) {
            System.out.println(data[i]);
        }
    }
    //Make function adding value with ArrayList

}
