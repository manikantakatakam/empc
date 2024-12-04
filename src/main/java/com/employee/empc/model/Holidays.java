package com.employee.empc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "Holidays")
public class Holidays {
    private String ocassion;
    private String date;

    // Getter Methods
    public String getOcassion() {
        return ocassion;
    }

    public String getdate() {
        return date;
    }

}
