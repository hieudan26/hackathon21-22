package thongke.model.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Data
@NoArgsConstructor
public class TimeLine {
    public Long timeStart;
    public Long timeEnd;
}
