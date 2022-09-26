/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class TColDir extends Token
{
    public TColDir()
    {
        super.setText("]");
    }

    public TColDir(int line, int pos)
    {
        super.setText("]");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TColDir(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTColDir(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TColDir text.");
    }
}