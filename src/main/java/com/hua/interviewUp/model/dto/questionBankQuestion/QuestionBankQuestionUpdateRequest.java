package com.hua.interviewUp.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新题库题目关联请求
 *
* @author <a href="https://github.com/ShaohuaTong">Programmer Hua</a>
* @from <a href="https://www.code-nav.cn">Programming Navigation Learning Circle</a>
 */
@Data
public class QuestionBankQuestionUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}