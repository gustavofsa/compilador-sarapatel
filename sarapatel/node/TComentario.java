/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import analysis.*;
import sarapatel.analysis.Analysis;

@SuppressWarnings("nls")
public final class TComentario extends Token
{
    public TComentario(String text)
    {
        setText(text);
    }

    public TComentario(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentario(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentario(this);
    }
}
