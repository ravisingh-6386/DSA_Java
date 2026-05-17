/* Nearby Cars

Qustion-1) We are given N points in a 2D plane which are locations of N cars.
If we are at the origin, print the nearest K cars.

> CO (3, 3)
, C1(5,-1)
C2 (-2,4)

ans = CO & C2

K=2 */
import java.util.*;
public class heaps {
    static class Car implements Comparable<Car>{
        int x;
        int y;
        public Car(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Car c2){
            return Integer.compare(this.x*this.x+this.y*this.y, c2.x*c2.x+c2.y*c2.y);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Car> pq = new PriorityQueue<>();
        pq.add(new Car(3, 3));
        pq.add(new Car(5, -1));
        pq.add(new Car(-2, 4));
        int k=2;
        for(int i=0;i<k;i++){
            Car c=pq.poll();
            System.out.println("Car at (" + c.x + ", " + c.y + ")");
        }
    }
}
