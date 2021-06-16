import java.util.ArrayList;
import java.util.Scanner;

public class Train
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //int train = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> train = new ArrayList<>();

        String[] inputData = scanner.nextLine()
            .split(" ");
        for (int i = 0; i < inputData.length; i++)
        {
            train.add(Integer.parseInt(inputData[i]));
        }

        int wagonCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end"))
        {
            String[] tokens = command.split(" ");
            if (command.contains("Add"))
            {
                int passengers = Integer.parseInt(tokens[1]);
                train.add(passengers);
            }
            else
            {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++)
                {
                    int newPassengersCount = passengers + train.get(i);
                    if (newPassengersCount <= wagonCapacity)
                    {
                        train.set(i, newPassengersCount);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < train.size(); i++)
        {
            System.out.println(train.get(i) + " ");
        }
    }
}
