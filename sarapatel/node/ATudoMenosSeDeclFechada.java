/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATudoMenosSeDeclFechada extends PDeclFechada
{
    private PTudoMenosSe _tudoMenosSe_;

    public ATudoMenosSeDeclFechada()
    {
        // Constructor
    }

    public ATudoMenosSeDeclFechada(
        @SuppressWarnings("hiding") PTudoMenosSe _tudoMenosSe_)
    {
        // Constructor
        setTudoMenosSe(_tudoMenosSe_);

    }

    @Override
    public Object clone()
    {
        return new ATudoMenosSeDeclFechada(
            cloneNode(this._tudoMenosSe_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATudoMenosSeDeclFechada(this);
    }

    public PTudoMenosSe getTudoMenosSe()
    {
        return this._tudoMenosSe_;
    }

    public void setTudoMenosSe(PTudoMenosSe node)
    {
        if(this._tudoMenosSe_ != null)
        {
            this._tudoMenosSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tudoMenosSe_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tudoMenosSe_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tudoMenosSe_ == child)
        {
            this._tudoMenosSe_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tudoMenosSe_ == oldChild)
        {
            setTudoMenosSe((PTudoMenosSe) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}