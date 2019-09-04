import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;
import java.util.List;



public class Impact implements NumberRangeSummarizer{

    
    @Override
    public Collection<Integer> collect(String input) {
        
        //split each item from strign and convert to integer
        //convert to a list using java streams
        List<Integer> tempList = Stream.of(input.split("\\,")).map(Integer::parseInt).collect(Collectors.toList());
        //conver list to arraylist because collections
        Collection<Integer> items = new ArrayList<>(tempList);
        return items;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        String summary = "";
        


        return summary;
    }

    public static void main(String[] args){
        
        String jude = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        
        Impact thabos = new Impact();
        Collection<Integer> fongkong = thabos.collect(jude);


        String ranges = compress(asList(1,2,3,4,5, 12,13,14, 19)).collect(joining("-"));
        
    }

}