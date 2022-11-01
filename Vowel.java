import java.io.*;
public class Vowel{
static void Vowel_Or_Consonant(char y)
{
if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
System.out.println("It is a vowel.");
else
System.out.println("It is a consonant.");
}
static public void main(String[]args)
{
Vowel_Or_Consonant('b');
Vowel_Or_Consonant('u');
}
}