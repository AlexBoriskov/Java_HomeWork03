import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Task_homework {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        Integer size = Integer.parseInt(iScanner.nextLine());
        List<Integer> list = new ArrayList<Integer>();
        iScanner.close();
        list = newArray(size, list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Integer min = list.get(0);
        Integer max = list.get(size-1);
        
        float sred = 0;
        for (int i = 0; i<list.size(); i++){
            sred = sred + list.get(i);
            if (list.get(i)%2 ==0) {
                list.remove(i);
                i--;
            }
        }

        System.out.printf("Минимальное значение = %d", min);
        System.out.println();
        System.out.printf("Максимальное значение = %d", max);
        System.out.println();
        System.out.printf("Среднее значение = %.2f", sred/size);
        System.out.print("Список без четных элементов: ");
        System.out.println(list);
    }

    static List<Integer> newArray (int size, List<Integer> list){
        for (int i=0; i<size; i++){
            list.add((int)(Math.random()*1000));
        }
        return list;
    }
}
