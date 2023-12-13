package by.itstep.demo.module;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Book implements Serializable {
    private Long id;
    private int price;
    private String title;


}
