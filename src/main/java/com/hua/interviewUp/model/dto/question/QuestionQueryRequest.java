package com.hua.interviewUp.model.dto.question;

import com.hua.interviewUp.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题目请求
 *
* @author <a href="https://github.com/ShaohuaTong">Programmer Hua</a>
* @from <a href="https://www.code-nav.cn">Programming Navigation Learning Circle</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * id
     */
    private Long notId;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 推荐答案
     */
    private String answer;

    private static final long serialVersionUID = 1L;
}