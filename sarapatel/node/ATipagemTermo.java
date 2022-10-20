/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATipagemTermo extends PTermo
{
    private PTipagem _tipagem_;

    public ATipagemTermo()
    {
        // Constructor
    }

    public ATipagemTermo(
        @SuppressWarnings("hiding") PTipagem _tipagem_)
    {
        // Constructor
        setTipagem(_tipagem_);

    }

    @Override
    public Object clone()
    {
        return new ATipagemTermo(
            cloneNode(this._tipagem_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipagemTermo(this);
    }

    public PTipagem getTipagem()
    {
        return this._tipagem_;
    }

    public void setTipagem(PTipagem node)
    {
        if(this._tipagem_ != null)
        {
            this._tipagem_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipagem_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipagem_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipagem_ == child)
        {
            this._tipagem_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipagem_ == oldChild)
        {
            setTipagem((PTipagem) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}