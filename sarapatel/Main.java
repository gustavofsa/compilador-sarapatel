package sarapatel;
import sarapatel.analysis.DepthFirstAdapter;
import sarapatel.lexer.*;
import sarapatel.parser.*;
import sarapatel.node.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Escreva um código em Sarapatel:");


			   // Create a Parser instance.
			   Parser p =
			    new Parser(
			    new Lexer(
			    new PushbackReader(
			    new InputStreamReader(System.in), 1024)));


			   // Parse the input.
			   Start tree = p.parse();


			   // Apply the translation.
			   tree.apply(new DepthFirstAdapter());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}