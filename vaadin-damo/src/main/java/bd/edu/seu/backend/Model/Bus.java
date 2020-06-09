package bd.edu.seu.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    private String busNumber ;
    private String staffName ;
    private String boardingPoint ;
    private String time ;
    private Integer numberofSeatAreFree;
    private Integer costPerSeat ;

}
