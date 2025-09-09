package student.dashboard.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "class_schedules")
public class ClassSchedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject; // Mathematics, Physics...
    private String teacher;
    private LocalTime startTime;
    private String room;
    private String tag; // "Quadratic Equations" etc.
    private LocalDate date; // optional specific date or recurring
}
