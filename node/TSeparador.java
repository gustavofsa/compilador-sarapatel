/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TSeparador extends Token
{
    public TSeparador()
    {
        super.setText("|");
    }

    public TSeparador(int line, int pos)
    {
        super.setText("|");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSeparador(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSeparador(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSeparador text.");
    }
}
