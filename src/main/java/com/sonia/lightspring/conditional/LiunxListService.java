package com.sonia.lightspring.conditional;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/17
 * @see
 */
public class LiunxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }
}
