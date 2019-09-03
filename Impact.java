import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.util.List;



public class Impact implements NumberRangeSummarizer{

    
    @Override
    public Collection<Integer> collect(String input) {
        Collection<Integer> items = new ArrayList<Integer>();
        
        //split each item from strign and convert to integer
        //String[] 
        //int[] array = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();


        return items;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        return null;
    }

    public static void main(String[] args){
        
        String jude = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        
        String[] judas = jude.split("\\,");

        
        int[] array = Arrays.asList(jude.split("\\,")).stream().mapToInt(Integer::parseInt).toArray();
        List<Integer> longIds = Stream.of(jude.split("\\,")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayList<Integer> fongkong = new ArrayList<>(longIds);
        for(int j=0; j<fongkong.size(); j++){
            System.out.println(fongkong.get(j));
        }
    }

}