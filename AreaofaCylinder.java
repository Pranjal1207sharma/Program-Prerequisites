import java.util.*;
class AreaofaCylinder{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double radius = sc.nextInt();
double height = sc.nextInt();
double volume = 3.14 * radius * radius * height;
System.out.println(volume);
}
}