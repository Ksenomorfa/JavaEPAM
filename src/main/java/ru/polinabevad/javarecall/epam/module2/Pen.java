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
        final ru.polinabevad.javarecall.epam.module2.Pen pen = new Pen();
        pen.setPrice(1);
        pen.setProductName(" ");
        System.out.println(pen);
        pen.equals(new Pen());
    }


}
