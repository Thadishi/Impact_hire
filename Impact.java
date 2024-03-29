import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;



public class Impact implements NumberRangeSummarizer{

    
    @Override
    public Collection<Integer> collect(String input) {
        
        //split each item from strign and convert to integer
        //convert string to a list using java streams
        List<Integer> tempList = Stream.of(input.split("\\,")).map(Integer::parseInt).collect(Collectors.toList());
        //conver list to arraylist because collections
        Collection<Integer> items = new ArrayList<>(tempList);
        return items;
    }

    public StringBuilder copy(StringBuilder stringb, int start,  int prev){

        //use dstrig builder 
        stringb.append(start);
    
        //if the start doesn't equal the next or previou
        if(start!=prev)
            stringb.append(prev-start >1? "-":", ").append(prev); //if difference is greater than 1, comma, else 
        return stringb;
    }
    

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        //where we store our strings
        StringBuilder stringb = new StringBuilder();
        
        //convetting collection to list
        List<Integer> userInput = new ArrayList<>(input);


        //from the beginning the previous symbol is 0, and it is also star symbol
        int prev = userInput.get(0);
        int start = prev;
        //iterate throuhgh the list from indx 1, 
        for( int x : userInput.subList(1, userInput.size())){
            if(prev+1 != x){
                copy(stringb, start, prev).append(", ");
                start = x;
            }
            prev = x;
        }
        String result = copy(stringb, start, prev).toString();

        return result;
    }

    public static void main(String[] args){
        
        String jude = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        
        Impact thabos = new Impact();
        Collection<Integer> fongkong = thabos.collect(jude);
        System.out.println(thabos.summarizeCollection(fongkong));
        
    }

}