package ru.polinabevad.javarecall.epam.module2;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors (chain = true)
public class Pen {
    private int price;
    private String productName;

    public static void  main(String [] args) {
        val pen = new Pen()
                .setPrice(1)
                .setProductName(" ");
        System.out.println(pen);
        pen.equals(new Pen());
    }


}
