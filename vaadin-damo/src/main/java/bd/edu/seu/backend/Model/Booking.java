package bd.edu.seu.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Booking {
    private String name;
    private String phone ;
    private String busNumber ;
    private LocalDate date;
    private String paymentType;
    private String seatNumber;
}
