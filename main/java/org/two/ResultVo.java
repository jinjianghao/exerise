package main.java.org.two;

import com.ymy.utils.I18nUtil;
import lombok.Getter;

@Getter
public class ResultVo<T> {

    private  String  code;

    private String msg;

    private T data;

    private String  createTime ;

    private  ResultVo(String code){
        this.code = code;
        setCode(code);
    }

    public void setCode(String code) {
        String message = null;
        try {
            message =I18nUtil.getMessage(code);
        }catch (Exception e){
            message = code;
        }
        this.code = code;
        this.msg = message;
    }

    public static<T> ResultVo<T> OK(){
        return new ResultVo<T>("SUCCESS");
    }

    public static<T> ResultVo<T> faild(String code){
        return new ResultVo<T>(code);
    }

}
