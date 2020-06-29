package github.clyoudu.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leichen
 * @date 2020/6/19 5:17 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDto {

    private int code;
    private String msg;
    private Object data;

}
