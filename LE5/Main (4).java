/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static void main(String[] args){
        Beverage b= new Whisky();
        b.templateMethod(30);
        b= new Beer();
        b.templateMethod(150);
    } 
}