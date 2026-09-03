// Activity Selection Problem using Greedy Algorithm.
import java.util.*;
public class greedy {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        // int start[]={10,12,20};
        // int end[]={20,25,30};
/////// sorting the activities according to their end time///
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        /// lambda function to sort the activities according to their end time///
        Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Maximum activities: " + maxAct);
        System.out.println("Selected activities: " + ans);
    }}
    

