/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TProcedimento extends Token
{
    public TProcedimento()
    {
        super.setText("procedimento");
    }

    public TProcedimento(int line, int pos)
    {
        super.setText("procedimento");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProcedimento(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProcedimento(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProcedimento text.");
    }
}
