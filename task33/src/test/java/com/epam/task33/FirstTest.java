package com.epam.task33;
import com.epam.task2.data.DataSource;
import com.epam.task2.entity.Book;
import com.epam.task2.model.Books;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class FirstTest {
    @Parameterized.Parameter
    public int price;

    @Parameterized.Parameter(1)
    public int number;

    @Parameterized.Parameters
    public static Collection data() throws IOException {
        init();

        return Arrays.asList(new Object[][]{
                {20, 2, 40},
                {20, 3, 60},
                {20, 4, 80},

        });
    }
    @BeforeClass
    public static void init() throws IOException {

    }

    @Test
    public void TestGetAfterYearRelease() {

    public int TestcountSumTest(){
        Assert.assertArrayEquals();

    }
}
