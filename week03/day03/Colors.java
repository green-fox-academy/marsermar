package com.greenfoxacademy.tombok;

public class Colors {
    public static void main(String[] args) {
//     String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
//     String[] red = {"orange red", "red", "tomato"};
//     String[] pink = {"orchid", "violet", "pink", "hot pink"};

        String[][] myColors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };
        for (int i = 0; i < myColors.length; i++) {
            for (int j = 0; j < myColors[i].length; j++) {
                System.out.println(myColors[i][j]);
            }
            System.out.println();
        }
    }
}

//// - Készíts egy kétdimenziós tömböt
////   ami megadott színek különböző árnyalatait tartalmazza
//// - A `colors[0]` a zöld árnyalatait tárolja:
////   `"lime", "forest green", "olive", "pale green", "spring green"`
//// - A `colors[1]` a piros árnyalatait:
////   `"orange red", "red", "tomato"`
//// - A `colors[2]` pedig a pink árnyalatait:
////   `"orchid", "violet", "pink", "hot pink"`
