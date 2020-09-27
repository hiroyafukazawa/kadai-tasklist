package validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    //タイトルの必須チェック
    public static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスクの内容を入力してください。";
        } else {
            return "";
        }
    }
}
