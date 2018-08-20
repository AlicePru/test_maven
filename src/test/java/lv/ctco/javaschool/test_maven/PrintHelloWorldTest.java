package lv.ctco.javaschool.test_maven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class PrintHelloWorldTest {

    @DisplayName("Empty string returns list of empty string")
    @Test
    void testEmpty() {
        assertThat(PrintHelloWorld.findAnagram("".toCharArray()),
                equalTo(Collections.<String>emptyList()));
    }

    @DisplayName("String with one char return list of one symbol")
    @Test
    void testSingleChar() {
        assertThat(PrintHelloWorld.findAnagram("a".toCharArray()),
                equalTo(Collections.singletonList("a")));
    }

    @DisplayName("String with two chars return list of two symbol")
    @Test
    void testNotSingleChar() {
        assertThat(new HashSet(PrintHelloWorld.findAnagram("ab".toCharArray())),
                equalTo(new HashSet(Arrays.asList("ab", "ba"))));

    }

    @DisplayName("String with three chars return list of three symbol")
    @Test
    void testWord() {
       System.out.println(PrintHelloWorld.findAnagram("fox".toCharArray()));
       assertThat(new HashSet(PrintHelloWorld.findAnagram("fox".toCharArray())),
                equalTo(new HashSet(Arrays.asList("fox", "xof","fxo","xfo","ofx","oxf"))));

    }

}