package sarapatel;
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
			String arquivo = "teste/teste.srptl";


			   // Create a Parser instance.
			   Parser p =
			    new Parser(
			    new Lexer(
			    new PushbackReader(
			    new FileReader(arquivo), 1024)));


			   // Parse the input.
			   Start tree = p.parse();


			   // Apply the translation.
			   tree.apply(new ASTDisplay());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}