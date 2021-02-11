import java.lang.Math.*;
class lineUC{
public static void main(String[] args){
int x1=5;
int y1=10;
int x2=15;
int y2=20;

int x3=10;
int y3=20;
int x4=15;
int y4=30;
double l1=((x2-x1)^2+(y2-y1)^2);
double l2=((x4-x3)^2+(y4-y3)^2);
int len2=(int)l2;
int len1=(int)l1;
int length1=(int)(Math.sqrt(len1));
int length2=(int)(Math.sqrt(len2));

System.out.println("length of line 1 is"+ length1+"and 2nd line length is"+length2);
if(length1==length2){
System.out.println("lines are equal");
}
else if(length1<length2){
System.out.println("line 1 is less than line 2");
}
else{
System.out.println("line 1 is greater than line 2");
}
}
}
