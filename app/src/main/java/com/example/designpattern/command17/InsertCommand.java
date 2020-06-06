package com.example.designpattern.command17;

/**
 * author:lgh on 2020/6/6 17:31
 */
class InsertCommand extends Command {
    Content mContent;

    String insert = "is";

    public InsertCommand(Content content) {
        mContent = content;
    }

    @Override
    void doit() {
        mContent.msg = mContent.msg + insert;
    }

    @Override
    void undo() {
        mContent.msg = mContent.msg.substring(insert.length());
    }
}
