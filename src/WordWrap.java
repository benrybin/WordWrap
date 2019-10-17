public class WordWrap {


    public static String wrapText(String words, int length) {
        String[] splitWords = words.split(" ");
        StringBuilder wordStack = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (String word:splitWords) {
            temp.append(word).append(" ");
            if(temp.length() >= length){
                wordStack.append(temp).append("\n");
                temp.delete(0,temp.length());
            }else{

            }


        }

        return wordStack.toString();
    }
}
