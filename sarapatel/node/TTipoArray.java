/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class TTipoArray extends Token
{
    public TTipoArray(String text)
    {
        setText(text);
    }

    public TTipoArray(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipoArray(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipoArray(this);
    }
}
