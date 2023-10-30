package racingcar.model;

import org.junit.platform.commons.util.StringUtils;
import racingcar.type.ExceptionConstants;

import static racingcar.type.ExceptionConstants.*;
import static racingcar.type.MessageType.*;

/**
 * @Class : 자동차 클래스
 */
public class Car {

    private String name;
    private int position;

    private Car() {
    }

    public Car(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(ERROR_INVALID_CAR_NAME);
        }
        this.name = name;
        this.position = 0;
    }

    public void go() {
        this.position++;
    }

    public String getPositionMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(COLON.getMessage());
        sb.append(ADVANCE.getMessage().repeat(position));
        return sb.toString();
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
