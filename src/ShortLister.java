import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line;
        Path target = new File(System.getProperty("user.dir")).toPath();
        target = target.resolve("src");
        chooser.setCurrentDirectory(target.toFile());

        System.out.println("Please select an existing text data file.");

        try
        {

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                target = chooser.getSelectedFile().toPath();  // object line

                inFile = new Scanner(target);
           //     System.out.println("ID#    First Name  Last Name   Title   YOB");
                System.out.println("=======================================================");
                while(inFile.hasNext())
                {
                    String word = inFile.next();
                    int count = 0;

                    ArrayList scanList = new ArrayList<>();
                    ShortWordFilter readThis = new ShortWordFilter(word);
                    scanList.add(readThis);

                    for(int i = 0; i < scanList.size(); i++)
                    {
                        if(readThis.isShort(word))
                        {
                            System.out.print(word);
                            System.out.printf("\n");
                        }
                        else
                        {
                            i++;
                        }
                    }
                }
                inFile.close();
            }
            else   // User did not pick a file, closed the chooser
            {
                System.out.println("Sorry, you must select a file! Termininating!");
                System.exit(0);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found Error");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("IOException Error");
            e.printStackTrace();
        }
    }

}
