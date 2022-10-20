/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADeclaracaoAbertaComando extends PComando
{
    private PDeclAberta _declAberta_;

    public ADeclaracaoAbertaComando()
    {
        // Constructor
    }

    public ADeclaracaoAbertaComando(
        @SuppressWarnings("hiding") PDeclAberta _declAberta_)
    {
        // Constructor
        setDeclAberta(_declAberta_);

    }

    @Override
    public Object clone()
    {
        return new ADeclaracaoAbertaComando(
            cloneNode(this._declAberta_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclaracaoAbertaComando(this);
    }

    public PDeclAberta getDeclAberta()
    {
        return this._declAberta_;
    }

    public void setDeclAberta(PDeclAberta node)
    {
        if(this._declAberta_ != null)
        {
            this._declAberta_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declAberta_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declAberta_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declAberta_ == child)
        {
            this._declAberta_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declAberta_ == oldChild)
        {
            setDeclAberta((PDeclAberta) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}