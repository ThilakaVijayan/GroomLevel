package com.company;

public class WhereTheSnakePassed {
    public void whereTheSnakePassed(String input){
        try {
            int[] inputArr = processInput(input);
            int currRow = 1;
            boolean right = true;
            if (inputArr[1] > 0) {
                while (currRow <= inputArr[0]) {
                    printHorizontalHashes(inputArr[1]);
                    currRow++;
                    if (currRow <= inputArr[0]) {
                        System.out.println();
                        printVerticalHashes(inputArr[1], right);
                        right = !right;
                    }
                    currRow++;
                    if (currRow <= inputArr[0]) {
                        System.out.println();
                    }
                }
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void printVerticalHashes(int columns, boolean right) {
        if (!right) {
            System.out.print("#");
        }
        for (int i = 0; i < columns - 1; i += 1) {
            System.out.print(".");
        }
        if (right) {

            System.out.print("#");
        }
    }

    private void printHorizontalHashes(int columns) {

        for (int i = 0; i < columns; i++) {
            System.out.print("#");
        }
    }

    private int[] processInput(String input) throws Exception {
        String[] arr = input.split(" ");

        if (arr.length != 2) {
            throw new Exception("Wrong Input format. Should have 2 values seperated by space. ex:\"3 3 \"");
        }
        int rows;
        int columns;
        try {
            rows = Integer.parseInt(arr[0]);
            columns = Integer.parseInt(arr[1]);

            if (3 > rows) {
                throw new Exception("Wrong Input. Rows has to be more than 2. ex:\"3 3 \"");
            }
            if (100 < columns) {
                throw new Exception("Wrong Input. Columns has to be less than 101. ex:\"3 3 \"");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Wrong Input. Use digits. Should have 2 values seperated by space. ex:\"3 3 \"");
        }


        return new int[]{rows, columns};


    }
}
