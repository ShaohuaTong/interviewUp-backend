package com.hua.interviewUp.model.dto.questionBank;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 编辑题库请求
 *
* @author <a href="https://github.com/ShaohuaTong">Programmer Hua</a>
* @from <a href="https://www.code-nav.cn">Programming Navigation Learning Circle</a>
 */
@Data
public class QuestionBankEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String picture;

    private static final long serialVersionUID = 1L;
}