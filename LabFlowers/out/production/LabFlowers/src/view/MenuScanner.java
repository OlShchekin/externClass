package view;

import java.util.Scanner;

public class MenuScanner implements MenuView {

    private static Scanner scan = new Scanner(System.in);

    public static int scanMenuItem(View view) {
        view.printMessage(CHOOSE_MENU_ITEM);
        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_NUMBER);
            view.printMessage(CHOOSE_MENU_ITEM);
            scan.next();
        }
        return scan.nextInt();
    }


    public static int checkMenuItem(View view, Integer menuItem) {
        while (menuItem > 3 || menuItem < 0) {
            view.printMessage(WRONG_NUMBER);

            menuItem = scanMenuItem(view);
        }
        return menuItem;
    }

    public static String scanBackToMenuKey() {
        return scan.next();
    }

}
