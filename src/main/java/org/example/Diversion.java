package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Diversion {

    public List<String> filterAdjacents(List<String> stringList) {
        return stringList.stream()
                .filter(s -> !s.contains("11"))
                .collect(Collectors.toList());
    }

    public List<String> getPermutations(int n) {
        List<String> permutations = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("0");
        }
        permute(permutations, sb, 0);
        return permutations;
    }

    private void permute(List<String> permutations, StringBuilder sb, int index) {
        if (index == sb.length()) {
            permutations.add(sb.toString());
            return;
        }

        sb.setCharAt(index, '0');
        permute(permutations, sb, index + 1);

        sb.setCharAt(index, '1');
        permute(permutations, sb, index + 1);
    }


}
