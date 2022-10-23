package nextstep.domain.reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ReservationEntity {

  Long id;
  Long scheduleId;
  LocalDate date;
  LocalTime time;
  String name;

}
