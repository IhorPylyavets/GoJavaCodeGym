package com.goit.practice.stringjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnixPath {
    public String simplify(String input) {
        List<String> path = new ArrayList<>(Arrays.asList(input.split("/")));

        boolean flag = false;

        for (int i = path.size()-1; i >= 0; i--) {
            if (path.get(i).equals("..")) {
                flag = true;
            }
            if (path.get(i).equals("") || path.get(i).equals(".") || flag) {
                path.remove(path.get(i));
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < path.size(); i++) {
            result.append("/");
            result.append(path.get(i));
        }

        return result.toString();
    }
}
