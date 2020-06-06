package com.example.designpattern.command17;

/**
 * author:lgh on 2020/6/6 17:32
 */
class CopyCommand extends Command {

    Content mContent;

    public CopyCommand(Content content) {
        mContent = content;
    }

    @Override
    void doit() {
        mContent.msg = mContent.msg + mContent.msg;
    }

    @Override
    void undo() {
        mContent.msg = mContent.msg.substring(mContent.msg.length() / 2);
    }
}
